#% Defined resource type multiple uses
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
	a { 'alice': owner => "alice" }
	a { 'bob': owner => "bob" }
}

define a ($owner) {
	user { $owner: password => 12345 }
}