;SUBHAJYOTI PRUSTY
;2241016491

mov ax, 0000h 
mov ds, ax 

mov al, [2000H]     
mov cl, 08h

loop1: shr al, 01
       jc loop2
       inc ch
loop2: dec cl
       jnz loop1
       
mov [2001h], ch
hlt         
