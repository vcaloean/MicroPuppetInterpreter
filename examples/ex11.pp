#% Variable declaration (top scope - post)
#% Catalog:
#% {
#%   "type": "User",
#%   "title": "alice",
#%   "parameters": {
#%     "password": 12345
#%   }
#% }

node default {
	user { 'alice':	password => $variable }
}

$variable = 12345