#% A class declaration using too many arguments
#% Catalog:
#% Error (Parameter not found)

node default {
	class { 'a':
		owner => 'alice',
		variable => 12345
	}
}

class a ($owner = "bob") {
	user { $owner: password => $variable }
}