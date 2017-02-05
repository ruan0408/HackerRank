

votes = ['michael', 'michael', 'bla']

dictionary = dict()

max_votes = 0
winners = []

for name in votes:
    if name not in dictionary:
        dictionary[name] = 1
    else:
        dictionary[name] += 1

    if dictionary[name] > max_votes:
        max_votes = dictionary[name]
        winners = []
        winners.append(name)
    elif dictionary[name] == max_votes:
        winners.append(name)

winners.sort()

print(winners[-1])



