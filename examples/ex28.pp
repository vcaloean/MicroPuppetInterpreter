#% Multiple class declarations
#% Catalog:
#% Error (Cannot declare a class multiple times)

node default {
	class { 'a': owner => 'alice' }
	class { 'a': owner => 'bob' }
}

class a ($owner = "charlie") {
	user { $owner: password => 12345 }
}