#% Giving resources default values
#% Catalog:
#% {
#%   "type": "File",
#%   "title": "file1",
#%   "parameters": {
#%     "mode": 123,
#%     "owner": "alice"
#%   }
#% },
#% {
#%   "type": "File",
#%   "title": "file2",
#%   "parameters": {
#%     "owner": "bob"
#%   }
#% }

node default {
	File { owner => 'alice' }
	file { 'file1': mode => 123 }
	file { 'file2': owner => 'bob' }
}