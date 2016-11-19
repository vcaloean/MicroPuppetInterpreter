#% Nested defined resource type 1
#% Catalog:
#% Error (Defintions may only appear at the top-level or inside another class)

node default {
	a { 'alice': owner => "alice" }
}

define a ($owner) {
	define b ($variable) {
		user { 'alice': password => $variable }
	}
}