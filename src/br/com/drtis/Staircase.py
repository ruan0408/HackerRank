n = 6

if n == 1:
    print('#')


spaces = ' ' * (n-1)
hashes = '#'

for i in range(n):
    print(spaces+hashes)
    spaces = spaces[1:]
    hashes += '#'



