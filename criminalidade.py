"""
UFCG
PROG1
LUIS EDUARDO FERNANDES RICARTE - 119210431
"""
parametro = float(input())

while True:
	entrada = input()
	entrada_quebrada = entrada.split()

	soma = 0

	if entrada == "fim":
		break

	for i in range(len(entrada_quebrada)):
		soma += float(entrada_quebrada[i])	
	media = soma/len(entrada_quebrada)

	if (parametro/2) > media:
		break
	if media > parametro: #<=
		print(entrada)
	




