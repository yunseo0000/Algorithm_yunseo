def solution(arr):
    answer = [] #결과를 담을 배열
    
    for i in range(len(arr)):
        if i == 0 or arr[i] != arr[i-1]:
            answer.append(arr[i])
    
    return answer