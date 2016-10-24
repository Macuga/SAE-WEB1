<?php

	echo $_GET['flaeche'];
	echo "<br>\n";
	echo $_GET['hoehe'];
	echo "<br>\n";
	echo $_GET['anzahl'];
	echo "<br>\n";
	echo $_GET['jahr'];
	echo "<br>\n";
	
	$file = fopen('daten.csv','w+');
	fwrite($file, '"Flaeche je Stockwerk in qm";"Stockwerkshoehe in m";"Anzahl Stockwerke";"Baujahr"' . "\n");
	fwrite($file, '"' . $_GET['flaeche'] . '";"' . $_GET['hoehe'] . '";"' . $_GET['anzahl'] . '";"' . $_GET['jahr'] . '"');
	fclose($file);
?>