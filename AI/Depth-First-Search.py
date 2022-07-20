def dfs(graph, start, target,visited=None):
  if visited is None:
      visited = set()
  visited.add(start)
  
  print(start, end=" => ")
  
  for next in graph[start] - visited:
    
    if((graph[start] - visited) == target):
      print(target)
      break
    dfs(graph, next, target, visited)
  

cities = { 
    "Oradea": set(["Zerind", "Sibiu"]),
    "Zerind": set(["Arad", "Oradea"]),
    "Arad": set(["Zerind", "Sibiu", "Timisoara"]),
    "Sibiu": set(["Oradea", "Fagaras", "Arad", "Rimnicu_Vilcea"]),
    "Fagaras": set(["Sibiu", "Bucharest"]),
    "Timisoara": set(["Arad", "Lugoj"]),
    "Rimnicu_Vilcea": set(["Sibiu", "Craiova", "Pitesti"]),
    "Lugoj": set(["Timisoara", "Mehadia"]),
    "Pitesti": set(["Rimnicu_Vilcea", "Bucharest", "Craiova"]),
    "Mehadia": set(["Lugoj", "Dobreta"]),
    "Dobreta": set(["Mehadia", "Craiova"]),
    "Craiova": set(["Dobreta", "Rimnicu_Vilcea", "Pitesti"]),
    "Bucharest": set(["Pitesti", "Fagaras", "Giurgiu", "Urziceni"]),
    "Giurgiu": set(["Bucharest"]),
    "Urziceni": set(["Bucharest", "Hirsova", "Vaslui"]),
    "Hirsova": set(["Urziceni", "Eforie"]),
    "Eforie": set(["Hirsova"]),
    "Vaslui": set(["Urziceni", "Lasi"]),
    "Lasi": set(["Vaslui", "Neamt"]),
    "Neamt": set(["Lasi"])
}

dfs(cities, "Oradea", {'Dobreta'})