def solution(s):
    stack = []
    
    for char in s:
        if char == '(':
            stack.append(char)  # '(' 문자는 스택에 넣음
        else:  # ')' 일 때
            if stack:
                stack.pop()  # 스택에서 '(' 하나 제거
            else:
                return False  # 스택이 비어있으면 올바르지 않은 괄호
    
    return len(stack) == 0  # 스택이 비어있으면 올바른 괄호