#% Class nesting
#% Catalog:
#% {
#%   "type": "User",
#%   "title": "alice",
#%   "parameters": {
#%     "password": 12345
#%   }
#% }

node default {
	include a::b
}

class a {
	class b {
		user { 'alice':	password => 12345 }
	}
}