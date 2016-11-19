#% Variable declaration (same scope - prior)
#% Catalog:
#% {
#%   "type": "User",
#%   "title": "alice",
#%   "parameters": {
#%     "password": 12345
#%   }
#% }

node default {
	$variable = 12345

	user { 'alice': password => $variable }
}