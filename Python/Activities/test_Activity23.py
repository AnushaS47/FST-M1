import pytest
# Create fixture

@pytest.mark.act23
def test_sum(num_list):
    sum=0
    for n in  num_list:
        sum +=n

     #Assertion
    assert sum == 55           
