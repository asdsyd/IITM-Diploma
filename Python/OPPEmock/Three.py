# A square matrix MM is said to be:
#
# diagonal: if the entries outside the main-diagonal are all zeros
# scalar: if it is a diagonal matrix, all of whose diagonal elements are equal
# identity: if it is a scalar matrix, all of whose diagonal elements are equal to 11
# Write a function named matrix_type that accepts a matrix MM as argument and returns the type of matrix. It should be one of these strings: diagonal, scalar, identity, non-diagonal. The type you output should be the most appropriate one for the given matrix.
#
# You do not have to accept input from the user or print output to the console. You just have to write the function definition.

def matrix_type(M):
    n = len(M)
    is_diag = True
    for i in range(n):
        for j in range(n):
            if i != j and M[i][j] != 0:
                is_diag = False
                break

    if is_diag:
        is_scalar = True
    else:
        is_scalar = False

    if is_scalar:
        l = M[0][0]
        for i in range(n):
            if M[i][i] != l:
                is_scalar = False
                break

    if is_scalar:
        is_iden = True
    else:
        is_iden = False

    if is_iden:
        f):
        if M[i][i] != 1:
            is_iden = False
        break

    if not is_diag:
        return 'non-diagonal'
    if is_iden:
        return 'identity'
    if is_scalar:
        return 'scalar'
    return 'diagonal'