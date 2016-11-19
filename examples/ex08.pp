#% Variable declaration (same scope - post)
#% Catalog:
#% Error (variable "variable" - undef)

node default {
	user { 'alice':	password => $variable }

	$variable = 12345
}