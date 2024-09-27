import unittest
from perfecto import esPerfecto

class TestPerfecto(unittest.TestCase):
    def test_es_perfecto(self):
        self.assertTrue(esPerfecto(28))

if __name__ == '__main__':
    unittest.main()
