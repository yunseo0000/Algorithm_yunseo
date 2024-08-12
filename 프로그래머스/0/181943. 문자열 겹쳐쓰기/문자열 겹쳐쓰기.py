def solution(my_string, overwrite_string, s):
    # 1. my_string의 처음부터 인덱스 s 이전까지 [:s]
    # 2. overwrite_string
    # 3. 인덱스 s + overwrite_string의 길이 이후부터 끝까지
    answer = my_string[:s] + overwrite_string + my_string[s+len(overwrite_string):]
    return answer
