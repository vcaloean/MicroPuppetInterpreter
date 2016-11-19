#% Assign variable out-of-scope
#% Catalog:
#% Error (Cannot assign to out-of-scope variable)

$variable = 12345

node default {
	$::variable = 67890
}