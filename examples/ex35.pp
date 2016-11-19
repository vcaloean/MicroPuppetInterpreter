#% Node defintions
#% Catalog:
#% {
#%   "type": "User",
#%   "title": "charlie",
#%   "parameters": {
#%     "password": 12345
#%   }
#% }

node "a" {
	user { 'alice': password => 12345 }
}

node "b,c,d" {
	user { 'bob': password => 12345 }
}

node default {
	user { 'charlie': password => 12345 }
}