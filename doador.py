"""
UFCG 
PROG1 
LUIS EDUARDO FERNANDES RICARTE - 119210431
"""
tipo_paciente = input()
rh_paciente = input()
tipo_doador = input()
rh_doador = input()

if rh_paciente == "-" and rh_doador == "+":
	print("incompatível")

elif tipo_paciente == "A" and tipo_doador == "B":
	print("incompatível")

elif tipo_paciente == "A" and tipo_doador == "AB":
	print("incompatível")

elif tipo_paciente == "A" and tipo_doador == "O":
	if rh_paciente == "-" and rh_doador == "-":
		print("compatível")
	else:
		print("incompatível")

elif tipo_paciente == "A" and tipo_doador == "A":
	if rh_paciente == "-" and rh_doador == "-":
		print("compatível")
	else:
		print("incompatível")

elif tipo_paciente == "B" and tipo_doador == "A":
	print("incompatível")

elif tipo_paciente == "B" and tipo_doador == "AB":
	print("incompatível")

elif tipo_paciente == "B" and tipo_doador == "O":
	if rh_paciente == "-" and rh_doador == "-":
		print("compatível")
	else:
		print("incompatível")

elif tipo_paciente == "B" and tipo_doador == "B":
	if rh_paciente == "-" and rh_doador == "-":
		print("compatível")
	else:
		print("incompatível")

elif tipo_paciente == "AB" and tipo_doador == "B":
	if rh_paciente == "-" and rh_doador == "-":
		print("compatível")
	else:
		print("incompatível")

elif tipo_paciente == "AB" and tipo_doador == "A":
	if rh_paciente == "-" and rh_doador == "-":
		print("compatível")
	elif rh_paciente == "+" or:
		print("incompatível")

elif tipo_paciente == "AB" and tipo_doador == "O":
	if rh_paciente == "-" and rh_doador == "-":
		print("compatível")
	else:
		print("incompatível")

elif tipo_paciente == "AB" and tipo_doador == "AB":
	if rh_paciente == "-" and rh_doador == "-":
		print("compatível")
	else:
		print("incompatível")
elif tipo_paciente == "O" and tipo_paciente == "O":
	print("compatível")
else:
	print("incompatível")
# ++ +- -- -+