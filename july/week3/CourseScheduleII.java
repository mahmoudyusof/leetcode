class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // build graph and indegree array
        List<Integer>[] graph = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++)
            graph[i] = new ArrayList();

        int[] indegree = new int[numCourses];
        for (int[] p : prerequisites) {
            graph[p[1]].add(p[0]);
            indegree[p[0]]++;
        }

        int[] order = new int[numCourses];
        int index = 0;

        // Initialize queue and add all courses having indegree 0
        Queue<Integer> queue = new LinkedList();
        for (int i = 0; i < numCourses; i++)
            if (indegree[i] == 0) {
                queue.add(i);
                order[index++] = i;
            }

        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int c : graph[current]) {
                indegree[c]--;
                if (indegree[c] == 0) {
                    queue.add(c);
                    order[index++] = c;
                }
            }
        }

        return index == numCourses ? order : new int[0];
    }
}
