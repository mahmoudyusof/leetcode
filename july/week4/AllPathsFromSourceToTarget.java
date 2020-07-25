class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList();
        Queue<List<Integer>> queue = new LinkedList();
        queue.add(Arrays.asList(0));
        
        int destinationVertex = graph.length - 1;
        
        while(!queue.isEmpty()) {
            List<Integer> pathSoFar = queue.poll();
            int currentVertex = pathSoFar.get(pathSoFar.size() - 1);
            // check if currentVertex is destinationVertex add pathSoFar in result
            if(currentVertex == destinationVertex) result.add(new ArrayList(pathSoFar));
            for(int v : graph[currentVertex]) {
                List<Integer> newPath = new ArrayList(pathSoFar);
                newPath.add(v);
                queue.add(newPath);
            }
        }
        
        return result;
    }
}
