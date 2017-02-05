n, m = [int(aux) for aux in input().strip().split()]

total_candy = 0
for i in range(m):
    a, b, k = [int(aux) for aux in input().strip().split()]
    number_jars = b - a + 1
    total_candy += number_jars * k

print(int(total_candy/n))