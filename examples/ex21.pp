#% Class nesting resulting in same defintions
#% Catalog:
#% {
#%   "type": "User",
#%   "title": "alice",
#%   "parameters": {
#%     "password": 12345
#%   }
#% },
#% {
#%   "type": "User",
#%   "title": "bob",
#%   "parameters": {
#%     "password": 67890
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

class a::b {
	user { 'bob': password => 67890 }
}