n = int(input().strip().split())
map = dict()

for i in range(n):
    a = int(input().strip().split())
    map[a] = 0

k = int(input().strip().split())

occurrences = 0

for key in map.keys():
    if key + k in map.keys():
        occurrences += 1

print(occurrences)