def solution(a, b):
    
    ab = int(str(a) + str(b))
    k = 2 * a * b
    
    if ab > k:
        return ab
    elif ab < k:
        return k
    else:
        return ab
            