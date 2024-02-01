----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date: 01.02.2024 12:44:01
-- Design Name: 
-- Module Name: Lab9_obj3 - Behavioral
-- Project Name: 
-- Target Devices: 
-- Tool Versions: 
-- Description: 
-- 
-- Dependencies: 
-- 
-- Revision:
-- Revision 0.01 - File Created
-- Additional Comments:
-- 
----------------------------------------------------------------------------------


library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--use IEEE.NUMERIC_STD.ALL;

-- Uncomment the following library declaration if instantiating
-- any Xilinx leaf cells in this code.
--library UNISIM;
--use UNISIM.VComponents.all;

entity lab9_obj3 is
    Port ( a,b,c : in STD_LOGIC;
           sum,carry : out STD_LOGIC);
end lab9_obj3;

architecture Behavioral of lab9_obj3 is
begin
 sum <=((not a) and (not b) and c)or ((not a) and b and (not c)) or (a and (not b) and (not c)) or (a and b and c);
carry <= ((not a) and b and c) or (a and (not b) and c ) or (a and b and (not c)) or (a and b and c);


end Behavioral;
