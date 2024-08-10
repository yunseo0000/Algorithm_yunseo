def solution(numbers):
    answer = [] #결과를 담을 리스트
    
    for i in range (len(numbers)):
        for j in range (i + 1, len(numbers)):
            result = numbers[i] + numbers[j]
            answer.append(result)
    
    answer = list(set(answer)) #중복 제거
    answer.sort() #오름차순 정렬
            
    return answer
