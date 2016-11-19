#% Overwriting a variable
#% Catalog:
#% Error (Cannot overwrite variable)

node default {
	$variable = 12345

	user { 'alice': password => $variable }

	$variable = 67890
}