#% Nested defined resource type 2
#% Catalog:
#% {
#%   "type": "User",
#%   "title": "alice",
#%   "parameters": {
#%     "password": 12345
#%   }
#% }

node default {
	a::b { 'alice': owner => "alice" }
}

class a {
	define b ($owner) {
		user { $owner: password => 12345 }
	}
}