
adj = {
    1: [2, 3],
    2: [1, 4, 5],
    3: [1],
    4: [2],
    5: [2]
}

def DFS (d,src,s=set(),q = []):
    q+= [src]
    s.add(src)

    for c in d[src]:
        if not s.__contains__(c):
            s.add(c)
            DFS(d,c,s,q)

    return q


print(DFS(adj,2))