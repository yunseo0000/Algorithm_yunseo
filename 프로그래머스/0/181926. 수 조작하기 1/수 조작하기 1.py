def solution(n, control):

    for k in control:
        if k == "w":
            n += 1
        if k == "s":
            n -= 1
        if k == "d":
            n += 10
        if k == "a":
            n -= 10            
    
    return n