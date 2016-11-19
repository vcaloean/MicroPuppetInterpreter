#% Nested node defintion
#% Catalog:
#% []

node default {
	include a
}

class a {
	node b {
		user { 'alice': password => 12345 }
	}
}