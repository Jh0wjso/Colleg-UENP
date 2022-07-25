from collections import defaultdict

path = []

class Graph:
 
    def __init__(self,vertices):

        self.V = vertices

        self.graph = defaultdict(list)
 
    def addEdge(self,u,v):
        self.graph[u].append(v)

    def DLS(self,src,target,maxDepth):
        if src == target : return True
 
        if maxDepth <= 0 : return False
 
        for i in self.graph[src]:
                if(self.DLS(i,target,maxDepth-1)):
                    path.append(i)
                    return True
        return False
 
    def IDDFS(self,src, target, maxDepth):
 
        for i in range(maxDepth):
            if (self.DLS(src, target, i)):
                return True
        return False


cities = Graph(46)
cities.addEdge("Oradea", "Zerind")
cities.addEdge("Oradea", "Siubiu")

cities.addEdge("Zerind", "Arad")
cities.addEdge("Zerind", "Oradea")

cities.addEdge("Arad", "Zerind")
cities.addEdge("Arad", "Siubiu")
cities.addEdge("Arad", "Timissora")

cities.addEdge("Sibiu", "Oradea")
cities.addEdge("Sibiu", "Fagaras")
cities.addEdge("Sibiu", "Arad")
cities.addEdge("Sibiu", "Rimnicu_Vilcea")

cities.addEdge("Faragas", "Sibiu")
cities.addEdge("Faragas", "Bucharest")

cities.addEdge("Timisoara", "Arad")
cities.addEdge("Timisoara", "Lugoj")

cities.addEdge("Rimnicu_Vilcea", "Sibiu")
cities.addEdge("Rimnicu_Vilcea", "Craiova")
cities.addEdge("Rimnicu_Vilcea", "Pitesti")

cities.addEdge("Lugoj", "Timisoara")
cities.addEdge("Lugoj", "Mehadia")

cities.addEdge("Pitesti", "Rimnicu_Vilcea")
cities.addEdge("Pitesti", "Bucharest")
cities.addEdge("Pitesti", "Craiova")

cities.addEdge("Mehadia", "Lugoj")
cities.addEdge("Mehadia", "Dobreta")

cities.addEdge("Dobreta", "Mehadia")
cities.addEdge("Dobreta", "Craiova")

cities.addEdge("Craiova", "Dobreta")
cities.addEdge("Craiova", "Rimnicu_Vilcea")
cities.addEdge("Craiova", "Pitesti")

cities.addEdge("Bucharest", "Pitesti")
cities.addEdge("Bucharest", "Fagaras")
cities.addEdge("Bucharest", "Giurgiu")
cities.addEdge("Bucharest", "Urziceni")

cities.addEdge("Giurgiu", "Bucharest")

cities.addEdge("Urziceni", "Bucharest")
cities.addEdge("Urziceni", "Hirsova")
cities.addEdge("Urziceni", "Vaslui")

cities.addEdge("Hirsova", "Urziceni")
cities.addEdge("Hirsova", "Eforie")

cities.addEdge("Eforie", "Hirsova")

cities.addEdge("Vaslui", "Urziceni")
cities.addEdge("Vaslui", "Lasi")

cities.addEdge("Lasi", "Vaslui")
cities.addEdge("Lasi", "Neamt")

cities.addEdge("Neamt", "Lasi")

target = "Timissora"; maxDepth = 25; src = "Oradea";

path.append(src)

if cities.IDDFS(src, target, maxDepth) == True:
    print ("Target is reachable from source " +
        "within max depth")
else :
    print ("Target is NOT reachable from source " +
        "within max depth")

print(path)