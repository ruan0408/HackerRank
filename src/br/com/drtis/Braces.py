

def braces(values):

    answers = []
    bracket_map = {'[': ']', '{': '}', '(': ')'}
    for value in values:
        continue_outer_loop = False
        stack = []

        for char in value:
            if char in bracket_map.keys():
                stack.append(char)
            elif stack and char == bracket_map[stack[-1]]:
                stack.pop()
            else:
                answers.append('NO')
                continue_outer_loop = True
                break

        if continue_outer_loop:
            continue

        if stack:
            answers.append('NO')
        else:
            answers.append('YES')

    return answers