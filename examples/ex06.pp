#% Overwriting a resource
#% Catalog:
#% Error (Cannot overwrite resource)

node default {
	user { 'alice': password => 12345 }
	user { 'alice': password => 67890 }
}