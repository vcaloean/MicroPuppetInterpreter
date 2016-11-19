#% Nest defined resource type 3
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
#%     "password": 12345
#%   }
#% }

node default {
	a::b { 'alice': owner => "alice" }
	a::b { 'bob': owner => "bob" }
}

class a {
	define b ($owner) {
		user { $owner: password => 12345 }
	}
}