#% A class declaration using missing parameters
#% Catalog:
#% Error (Parameter doesn't exist)

node default {
	class { 'a': variable => 12345 }
}

class a ($owner = "alice") {
	user { $owner: password => $variable }
}