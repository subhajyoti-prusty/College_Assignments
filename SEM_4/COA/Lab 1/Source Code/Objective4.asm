;SUBHAJYOTI PRUSTY
;2241016491


; 2's compliment
mov ax, 0000h
mov ds, ax 
mov al, [2000h] 
not al
inc al
mov [2001h], al
hlt
