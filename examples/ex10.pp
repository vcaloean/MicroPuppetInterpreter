#% Variable declaration (top scope - prior)
#% Catalog:
#% {
#%   "type": "User",
#%   "title": "alice",
#%   "parameters": {
#%     "password": 12345
#%   }
#% }

$variable = 12345

node default {
	user { 'alice':	password => $variable }
}