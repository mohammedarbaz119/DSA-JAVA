

d = {
    "a": ["b", "c"],
    "b": ["d"],
    "c": ["e"],
    "d": ["f"],
    "e": [],
    "f": ["g"],
    "g": []
}


def dfs(d: dict, st: str) -> None:
    s = [st]
    while(len(s) > 0):
        t = s.pop()
        print(t)
        for i in d[t]:
            s.append(i)


dfs(d, "a")
