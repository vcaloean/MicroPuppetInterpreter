#% Multiple class defintions
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
	include a
}

class a {
	user { 'alice': password => 12345 }
}

class a {
	user { 'bob':	password => 67890 }
}