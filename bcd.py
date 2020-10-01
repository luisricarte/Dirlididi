"""
UFCG 
PROG1 
LUIS EDUARDO FERNANDES RICARTE - 119210431
"""
#0001 0010 0011 0100 0101 0110 0111 1000 1001 1010 1011 1100 1101 1110 1111 
lista_prints = []
num = 0
digito1 = 0
digito2 = 0

while True:
	binario = input()
	if binario == "fim":
		break
	if len(binario) == 4:
		if binario == "1111":
			lista_prints.append("Tente novamente.")
		elif binario == "1110":
			lista_prints.append("Tente novamente.")
		elif binario == "1101":
			lista_prints.append("Tente novamente.")
		elif binario == "1100":
			lista_prints.append("Tente novamente.")
		elif binario == "1011":
			lista_prints.append("Tente novamente.")
		elif binario == "1010":
			lista_prints.append("Tente novamente.")
		else:
			for i in range(4): #0(8) 1(4) 2(2) 3(1) 
				if binario[i] == 1 and i == 0:
					num += 8
				if binario[i] == 1 and i == 1:
					num += 4
				if binario[i] == 1 and i == 2:
					num	+= 2
				if binario[i] == 1 and i == 3:
					num += 1
			lista_prints.append(num)
			break
	if len(binario) == 8:
		for i in range(len(binario)): # 0(8) 1(4) 2(2) 3(1) 4(8) 5(4) 6(2) 7(1) 
			if binario[i] == 1 and i == 0:		
				digito1 += 8

			if binario[i] == 1 and i == 4:
				digito2 += 8

			if binario[i] == 1 and i == 1:
				digito1 += 4

			if i == 5 and binario[i] == 1:
				digito2 += 4

			if binario[i] == 1 and i == 2:
				digito1 += 2

			if i == 6 and binario[i] == 1:
				digito2 += 2
					
			if binario[i] == 1 and i == 3:
				digito1 += 1
				
			if i == 7 and binario[i] == 1:
				digito2 += 1

		if digito1 > 9 or digito2 > 9 or digito1 + digito2 == 0:
			lista_prints.append("BCD inválido.")
		elif digito1 < 10 and digito2 < 10 or digito1 == digito2 and digito1 != 0:
			numero_total = str(digito1) + str(digito2)
			lista_prints.append(numero_total)


if binario == "fim":
	for i in range(len(lista_prints)):
		print(lista_prints[i])
		break
