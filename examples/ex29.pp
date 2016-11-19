#% Defined resource type
#% Catalog:
#% {
#%   "type": "User",
#%   "title": "alice",
#%   "parameters": {
#%     "password": 12345
#%   }
#% }

node default {
	a { 'alice': variable => 12345 }
}

define a ($variable = 67890) {
	user { 'alice': password => $variable }
}