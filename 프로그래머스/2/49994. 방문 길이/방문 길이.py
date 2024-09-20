def solution(dirs):
    x, y, history = 0, 0, set()
    d2xy = {
        'U': (0, 1),	# x=0, y=1
        'D': (0, -1),	# x=0, y=-1
        'L': (-1, 0),	# x=-1, y=0
        'R': (1, 0),	# x=1, y=0
    }
    
    for d in dirs:
        dx, dy = d2xy[d]
        if -5 <= x+dx <= 5 and -5 <= y+dy <= 5:
            history.add((x, y, x+dx, y+dy))
            history.add((x+dx, y+dy, x, y))
            x += dx
            y += dy
        
    return len(set(history)) // 2