<?php 

$operacion=$_POST['lista'];

if (isset($_POST['C1']) && !empty($_POST['C1']) &&
	isset($_POST['C2'])	&& !empty($_POST['C2']) &&
	isset($_POST['C3']) && !empty($_POST['C3']))
{
	echo "El resultado es: ";
// se estan pidiedo los datos que se van a operar y las operaciones validas
	switch ($operacion) {
		case 'sumar':
			echo $_POST['C1'] + $_POST['C2'] + $_POST['C3'];
			break;

		case 'restar':
			echo $_POST['C1'] - $_POST['C2'] - $_POST['C3'];
			break;

		case 'multiplicar':
			echo $_POST['C1'] * $_POST['C2'] * $_POST['C3'];
			break;

		case 'dividir':
			echo $_POST['C1'] / $_POST['C2'] / $_POST['C3'];
			break;
		
		default:
			echo "No se ha podido operar";
			break;
	}
}
else
{
	echo "debes insertar todos los campos";
}
  ?>
