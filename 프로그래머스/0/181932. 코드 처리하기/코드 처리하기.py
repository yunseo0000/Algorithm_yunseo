def solution(code):
    
    mode = 0
    ret = []
    
    for idx in range(len(code)):
        if code[idx] == "1":
            mode = 1 - mode
        else:
            if mode == 0 and idx % 2 == 0:
                ret.append(code[idx])
            elif mode == 1 and idx % 2 == 1:
                ret.append(code[idx])
                
    ret_str = ''.join(ret)
    return ret_str if ret_str else "EMPTY"