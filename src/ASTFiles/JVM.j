.class public Stack
.super java/lang/Object

; default constructor
.method public <init>()V
	aload_0
	invokespecial java/lang/Object/<init>()V
	return
.end method

.method public ret5(I)I
	.limit stack 0
	.limit locals 3

	ldc 5
	ireturn
.end method

.method public test(II)I
	.limit stack 0
	.limit locals 4

	aload 0			; Method ret5() call
	ldc 1
	invokevirtual Stack/ret5(I)I
	ldc 1
	ireturn
.end method

.method public static main([Ljava/lang/String;)V
	.limit stack 0
	.limit locals 0

	return
.end method

