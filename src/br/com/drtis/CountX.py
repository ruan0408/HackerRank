def countX(steps):

    min_row = -1
    min_column = -1

    for step in steps:
        row, column = [int(aux) for aux in step.strip().split()]

        if min_row == -1 or row < min_row:
            min_row = row

        if min_column == -1 or column < min_column:
            min_column = column


    return min_row * min_column