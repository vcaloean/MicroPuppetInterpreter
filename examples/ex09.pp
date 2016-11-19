#% Qualified variable call
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
  $variable = 67890

	user { 'alice':	password => $::variable }
}